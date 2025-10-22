import click
import csv
import os


class Config:
    def __init__(self):
        self.package_name = ""
        self.repository_url = ""
        self.test_repo_mode = False
        self.package_version = ""
        self.output_filename = "graph.png"
        self.ascii_tree_mode = False
        self.max_depth = 10
        self.package_filter = ""

    def load_from_csv(self, config_file: str):
        try:
            with open(config_file, 'r') as file:
                reader = csv.DictReader(file)
                for row in reader:
                    self._process_row(row)
        except Exception as e:
            raise ConfigError(f"File error: {str(e)}")

    def _process_row(self, row):
        param = row.get('parameter', '').strip().lower()
        val = row.get('value', '').strip()

        if param == 'package_name':
            self.package_name = val
        elif param == 'repository_url':
            self.repository_url = val
        elif param == 'test_repo_mode':
            self.test_repo_mode = val.lower() in ('true', '1', 'yes')
        elif param == 'package_version':
            self.package_version = val
        elif param == 'output_filename':
            self.output_filename = val or "graph.png"
        elif param == 'ascii_tree_mode':
            self.ascii_tree_mode = val.lower() in ('true', '1', 'yes')
        elif param == 'max_depth':
            self.max_depth = max(1, min(100, int(val)))
        elif param == 'package_filter':
            self.package_filter = val

    def validate(self):
        if not self.package_name: raise ConfigError("Package name required")
        if not self.repository_url: raise ConfigError("Repository URL required")
        if self.test_repo_mode and not os.path.exists(self.repository_url):
            raise ConfigError("Test repo not found")

    def to_dict(self):
        return {k: v for k, v in self.__dict__.items()}


class ConfigError(Exception): pass


@click.command()
@click.argument('config_file')
def main(config_file):
    """Dependency graph visualizer - Stage 1"""
    config = Config()

    try:
        config.load_from_csv(config_file)
        config.validate()

        click.echo("Configuration:")
        for k, v in config.to_dict().items():
            click.echo(f"{k:20}: {v}")

    except Exception as e:
        click.echo(f"Error: {str(e)}", err=True)


if __name__ == '__main__':
    main()